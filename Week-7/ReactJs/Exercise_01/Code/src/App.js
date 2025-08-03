import React from 'react';
import ListofPlayers from './Components/ListofPlayers';
import IndianPlayers from './Components/IndianPlayers';

function App() {
  const flag = false; 

  return (
    <>
      {/* <h1>Cricket App</h1> */}
      {flag ? <ListofPlayers /> : <IndianPlayers />}
    </>
  );
}

export default App;
