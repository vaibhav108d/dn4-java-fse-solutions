const CourseDetails = () => {
  const coursedet = (
    <ul>
      <li>
        <h3>Angular</h3>
        <p>4/5/2021</p>
      </li>
      <li>
        <h3>React</h3>
        <p>6/3/2021</p>
      </li>
    </ul>
  );

  return (
    <div className="mystyle1">
      <h1>Course Details</h1>
      {coursedet}
    </div>
  );
};

export default CourseDetails;
