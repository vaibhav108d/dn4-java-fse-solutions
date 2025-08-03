import React from 'react';

const IndianPlayers = () => {
  const T20players = ["Virat", "Rohit", "Bumrah", "Gill", "Surya"];
  const RanjiTrophyPlayers = ["Rahane", "Pujara", "Shaw", "Iyer", "Saini"];

  const allPlayers = [...T20players, ...RanjiTrophyPlayers];

  const oddTeam = allPlayers.filter((_, index) => index % 2 !== 0);
  const evenTeam = allPlayers.filter((_, index) => index % 2 === 0);

  return (
    <div>

      <h3>Odd Players:</h3>
      <ul>
        {oddTeam.map((p, i) => <li key={i}>{p}</li>)}
      </ul>

      <h3>Even Players:</h3>
      <ul>
        {evenTeam.map((p, i) => <li key={i}>{p}</li>)}
      </ul>

      <h2>All Indian Players</h2>
      <p>{allPlayers.join(", ")}</p>
    </div>
  );
};

export default IndianPlayers;
