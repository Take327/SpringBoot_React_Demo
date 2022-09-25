import React from "react";
import { Link } from "react-router-dom";

const Navi: React.FC = () => {
  return (
    <nav>
      <ul>
        <li>
          <Link to={"/"}>Home</Link>
        </li>
        <li>
          <Link to={"/page1"}>page1</Link>
        </li>
      </ul>
    </nav>
  );
};

export default Navi;
