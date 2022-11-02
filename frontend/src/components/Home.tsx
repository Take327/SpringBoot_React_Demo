import React from "react";

const login = async () => {};

const Home: React.FC = () => {
  const [id, setId] = React.useState("");
  const [pass, setPass] = React.useState("pass");

  const login = async () => {
    const fd = new FormData();
    fd.append("id", id);
    fd.append("pass", pass);

    const response = await fetch("http://localhost:8080/login", {
      method: "POST",
      body: fd,
      credentials: "include",
    });
  };

  return (
    <div>
      <div>
        <label>
          id
          <input
            id="id"
            name="id"
            type="text"
            onChange={(e) => setId(e.target.value)}
          />
        </label>
      </div>
      <div>
        <label>
          pass
          <input
            id="pass"
            name="pass"
            type="text"
            onChange={(e) => setPass(e.target.value)}
          />
        </label>
      </div>
      <button onClick={login}>login</button>
    </div>
  );
};

export default Home;
