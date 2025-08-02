import React from 'react';
import './App.css';
import CalculateScore from './Components/CalculateScore';

function App() {
  return (
    <div className="App">
      <CalculateScore name="Ramit Gangwar" school="KIET" total={450} goal={5} superset={6367406}/>
    </div>
  );
}

export default App;
