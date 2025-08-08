import React, { useState } from 'react';
import BookDetails from './components/BookDetails';
import BlogDetails from './components/BlogDetails';
import CourseDetails from './components/CourseDetails';

function App() {
  const [view, setView] = useState('book');

  const renderComponentIfElse = () => {
    if (view === 'book') {
      return <BookDetails />;
    } else if (view === 'blog') {
      return <BlogDetails />;
    } else {
      return <CourseDetails />;
    }
  };

  const renderComponentTernary = 
    view === 'book' ? <BookDetails /> :
    view === 'blog' ? <BlogDetails /> : <CourseDetails />;

  const renderComponentSwitch = () => {
    switch (view) {
      case 'book': return <BookDetails />;
      case 'blog': return <BlogDetails />;
      case 'course': return <CourseDetails />;
      default: return null;
    }
  };

  return (
    <div className="App">
      <h1>Blogger App</h1>

      <div>
        <button onClick={() => setView('book')}>Book</button>
        <button onClick={() => setView('blog')}>Blog</button>
        <button onClick={() => setView('course')}>Course</button>
      </div>

      <h2>Using if-else</h2>
      {renderComponentIfElse()}

      <h2>Using Ternary</h2>
      {renderComponentTernary}

      <h2>Using Switch</h2>
      {renderComponentSwitch()}
    </div>
  );
}

export default App;
