import React from 'react';

const WelcomeButton = () => {
  const sayWelcome = (msg) => {
    alert(msg);
  };

  return (
    <div>
      <button onClick={() => sayWelcome("Welcome!")}>Say Welcome</button>
    </div>
  );
};

export default WelcomeButton;
