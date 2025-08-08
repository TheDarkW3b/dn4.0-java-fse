import React from 'react';
import Counter from './components/Counter';
import SayWelcome from './components/SayWelcome';
import SyntheticEventButton from './components/SyntheticEventButton';
import CurrencyConverter from './components/CurrencyConverter';

function App() {
  return (
    <div className="App">
      <Counter />
      <SayWelcome />
      <SyntheticEventButton />
      <CurrencyConverter />
    </div>
  );
}

export default App;
