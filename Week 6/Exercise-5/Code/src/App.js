import React from 'react';
import CohortDetails from './components/CohortDetails';

function App() {
  const cohorts = [
    { name: 'React Bootcamp', status: 'ongoing', startDate: '2025-07-01', endDate: '2025-08-15' },
    { name: 'NodeJS Advanced', status: 'completed', startDate: '2025-06-01', endDate: '2025-07-15' }
  ];

  return (
    <div className="App">
      {cohorts.map((c, idx) => (
        <CohortDetails key={idx} cohort={c} />
      ))}
    </div>
  );
}

export default App;
