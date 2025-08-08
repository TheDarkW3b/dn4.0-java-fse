import React from 'react';

function App() {
  const offices = [
    { name: 'Tech Park Alpha', rent: 55000, address: 'MG Road, Bengaluru', img: 'https://via.placeholder.com/200' },
    { name: 'Innovation Hub', rent: 75000, address: 'Cyber City, Gurugram', img: 'https://via.placeholder.com/200' },
    { name: 'Startup Bay', rent: 45000, address: 'Salt Lake, Kolkata', img: 'https://via.placeholder.com/200' }
  ];

  return (
    <div className="App">
      <h1>Office Space Rentals</h1>
      {offices.map((office, index) => (
        <div key={index} style={{
          border: '1px solid black',
          borderRadius: '8px',
          padding: '15px',
          margin: '10px',
          display: 'inline-block',
          width: '250px'
        }}>
          <img src={office.img} alt={office.name} style={{ width: '100%', borderRadius: '5px' }} />
          <h2>{office.name}</h2>
          <p style={{ color: office.rent < 60000 ? 'red' : 'green' }}>
            Rent: ₹{office.rent}
          </p>
          <p>{office.address}</p>
        </div>
      ))}
    </div>
  );
}

export default App;
