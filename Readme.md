##後悔
SpringBootのレスポンスをReactで作った画面にできないかなと思って、  
考えて作ってみたものの、よくよく考えれば、  
フロントはWebサーバーに配置して、APサーバーはAPIサーバーとしてJSON返却だけすればいいよねという、  
てかそっちのほうがAPサーバーがシンプルだし、変更しやすい。。。  
  
このリポジトリはMybatisのメモとして残す  

##DB
CREATE TABLE "user" (  
	"id"	INTEGER NOT NULL,  
	"name"	TEXT NOT NULL,  
	"address"	TEXT,  
	"phone"	TEXT,  
	"update_date"	TEXT NOT NULL,  
	"create_date"	TEXT NOT NULL,  
	"delete_date"	TEXT,  
	PRIMARY KEY("id" AUTOINCREMENT)  
)  

INSERT INTO 'user' ('id', 'name', 'address', 'phone', 'update_date', 'create_date') VALUES ('1', 'テスト太郎', '東京都サンプル区1-1', '080-0000-0000', '2019-05-06 12:00:00', '2019-05-01 12:00:00');

