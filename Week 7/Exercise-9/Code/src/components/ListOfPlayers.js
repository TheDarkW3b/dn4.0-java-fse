import React from 'react';

function ListOfPlayers() {
  const players = [
    { name: 'Rohit Sharma', score: 82 },
    { name: 'Virat Kohli', score: 65 },
    { name: 'Shubman Gill', score: 45 },
    { name: 'Suryakumar Yadav', score: 92 },
    { name: 'Hardik Pandya', score: 74 },
    { name: 'Ravindra Jadeja', score: 55 },
    { name: 'Rishabh Pant', score: 33 },
    { name: 'Kuldeep Yadav', score: 77 },
    { name: 'Mohammed Shami', score: 21 },
    { name: 'Jasprit Bumrah', score: 15 },
    { name: 'Mohammed Siraj', score: 48 }
  ];

  const lowScorers = players.filter(player => player.score < 70);

  return (
    <div>
      <h2>All Players</h2>
      <ul>
        {players.map((player, idx) => (
          <li key={idx}>{player.name} - {player.score}</li>
        ))}
      </ul>

      <h3>Players with score below 70</h3>
      <ul>
        {lowScorers.map((player, idx) => (
          <li key={idx}>{player.name} - {player.score}</li>
        ))}
      </ul>
    </div>
  );
}

export default ListOfPlayers;
