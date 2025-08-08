import React, { useState } from 'react';

function CurrencyConverter() {
  const [inr, setInr] = useState('');
  const [euro, setEuro] = useState('');

  const handleSubmit = (event) => {
    event.preventDefault();
    const conversionRate = 0.011; 
    setEuro((inr * conversionRate).toFixed(2));
  };

  return (
    <div>
      <h2>Currency Converter (INR → EUR)</h2>
      <form onSubmit={handleSubmit}>
        <input
          type="number"
          value={inr}
          onChange={(e) => setInr(e.target.value)}
          placeholder="Enter INR"
          required
        />
        <button type="submit">Convert</button>
      </form>
      {euro && <p>{inr} INR = {euro} EUR</p>}
    </div>
  );
}

export default CurrencyConverter;
