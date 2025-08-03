import React from 'react';
import Counter from './Components/Counter';
import WelcomeButton from './Components/WelcomeButton';
import SyntheticEventExample from './Components/SyntheticEventExample';
import CurrencyConvertor from './Components/CurrencyConvertor';

function App() {
  return (
    <div className="App">
      <h1>React Event Handling Demo</h1>
      
      <section>
        <h2>Counter</h2>
        <Counter />
      </section>

      <section>
        <h2>Welcome Button</h2>
        <WelcomeButton />
      </section>

      <section>
        <h2>Synthetic Event</h2>
        <SyntheticEventExample />
      </section>

      <section>
        <h2>Currency Convertor</h2>
        <CurrencyConvertor />
      </section>
    </div>
  );
}

export default App;
