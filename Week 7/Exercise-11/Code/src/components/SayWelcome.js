import React from 'react';

function SayWelcome() {
  const handleWelcome = (message) => {
    alert(message);
  };

  return (
    <div>
      <button onClick={() => handleWelcome("Welcome")}>Say Welcome</button>
    </div>
  );
}

export default SayWelcome;
