package com.example.demo;

import java.io.IOException;
import java.io.Reader;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@EnableAutoConfiguration
public class SampleController {
	@RequestMapping("/api")
	@ResponseBody
	List<Map<String, Object>> home() {
		String resource = "mybatis-config.xml";
		try (Reader in = Resources.getResourceAsReader(resource)) {
			// ★設定ファイルを元に、 SqlSessionFactory を作成する
			SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);

			// ★SqlSessionFactory から SqlSession を生成する
			SqlSession session = factory.openSession();
			// ★SqlSession を使って SQL を実行する
			List<Map<String, Object>> result = session.selectList("sample.mybatis.selectTest");
			return result;
		} catch (IOException e) {
			// nop
		}

		return null;
	}

}