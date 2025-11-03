import React from "react";
import Greeting from "./Greeting";

function App() {
  return (
    <div>
      <Greeting name="Siddhesh" age={21} />
      <Greeting name="Alice" age={25} />
    </div>
  );
}

export  {App};


//////////////////////////
import React from "react";

const Greeting = (props) => {
  return (
    <h2>
      Hello {props.name}, you are {props.age} years old!
    </h2>
  );
};

export default Greeting;
