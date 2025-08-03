import React from 'react';

const players = [
  { name: "Virat", score: 85 },
  { name: "Rohit", score: 45 },
  { name: "Rahul", score: 78 },
  { name: "Dhoni", score: 92 },
  { name: "Jadeja", score: 33 },
  { name: "Bumrah", score: 55 },
  { name: "Shami", score: 88 },
  { name: "Gill", score: 99 },
  { name: "Iyer", score: 72 },
  { name: "Pant", score: 60 },
  { name: "Kuldeep", score: 41 }
];

const ListofPlayers = () => {
  const filteredPlayers = players.filter(player => player.score < 70);

  return (
    <>
      <h2>All Players</h2>
      <ul>
        {players.map((p, idx) => (
          <li key={idx}>{p.name} - {p.score}</li>
        ))}
      </ul>

      <h2>Players with score &lt; 70</h2>
      <ul>
        {filteredPlayers.map((p, idx) => (
          <li key={idx}>{p.name} - {p.score}</li>
        ))}
      </ul>
    </>
  );
};

export default ListofPlayers;
