import React from 'react';

const SyntheticEventExample = () => {
  const handleClick = (e) => {
    e.preventDefault();
    alert("I was clicked");
  };

  return (
    <div>
      <button onClick={handleClick}>Click on Me</button>
    </div>
  );
};

export default SyntheticEventExample;
