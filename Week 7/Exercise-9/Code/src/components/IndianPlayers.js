import React from 'react';

function IndianPlayers() {
  const oddTeamPlayers = ['Rohit', 'Gill', 'Hardik', 'Pant', 'Bumrah'];
  const evenTeamPlayers = ['Kohli', 'Surya', 'Jadeja', 'Kuldeep', 'Shami', 'Siraj'];

  const [firstOdd, ...restOdd] = oddTeamPlayers;
  const [firstEven, ...restEven] = evenTeamPlayers;

  const T20Players = ['Ishan Kishan', 'Deepak Chahar'];
  const RanjiTrophyPlayers = ['Cheteshwar Pujara', 'Ajinkya Rahane'];
  const mergedPlayers = [...T20Players, ...RanjiTrophyPlayers];

  return (
    <div>
      <h2>Odd Team Players</h2>
      <p>Captain: {firstOdd}</p>
      <p>Others: {restOdd.join(', ')}</p>

      <h2>Even Team Players</h2>
      <p>Captain: {firstEven}</p>
      <p>Others: {restEven.join(', ')}</p>

      <h2>Merged Player List</h2>
      <ul>
        {mergedPlayers.map((player, idx) => (
          <li key={idx}>{player}</li>
        ))}
      </ul>
    </div>
  );
}

export default IndianPlayers;
