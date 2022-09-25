import React from "react";
import logo from "./logo.svg";
import "./App.css";
import { Route, Routes } from "react-router-dom";
import Navi from "./components/Navi";
import Home from "./components/Home";
import Page1 from "./components/Page1";

function App() {
  return (
    <div className="App">
      <Routes>
        <Route path="/" element={<Home />} />
        <Route path="/page1" element={<Page1 />} />
      </Routes>
      <Navi />
    </div>
  );
}

export default App;
