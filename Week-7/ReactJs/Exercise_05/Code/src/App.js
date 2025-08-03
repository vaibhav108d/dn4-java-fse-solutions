import React from "react";
import CourseDetails from "./Components/CourseDetails";
import BookDetails from "./Components/BookDetails";
import BlogDetails from "./Components/BlogDetails";
import "./App.css";

function App() {
  return (
    <div>
      <div style={{ display: "flex", justifyContent: "space-around" }}>
        <CourseDetails />
        <BookDetails />
        <BlogDetails />
      </div>
    </div>
  );
}

export default App;