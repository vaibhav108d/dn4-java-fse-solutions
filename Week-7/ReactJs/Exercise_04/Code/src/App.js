import { useState } from "react";
import GuestPage from "./Components/GuestPage";
import UserPage from "./Components/UserPage";

function App() {
  const [isLoggedIn, setIsLoggedIn] = useState(false);

  let pageToDisplay;
  if (isLoggedIn) {
    pageToDisplay = <UserPage />;
  } else {
    pageToDisplay = <GuestPage />;
  }

  return (
    <div className="App">
      <h1>Flight Ticket Booking</h1>

      {/* Button toggles login state */}
      {isLoggedIn ? (
        <button onClick={() => setIsLoggedIn(false)}>Logout</button>
      ) : (
        <button onClick={() => setIsLoggedIn(true)}>Login</button>
      )}

      {/* Conditional rendering via element variable */}
      {pageToDisplay}
    </div>
  );
}

export default App;
