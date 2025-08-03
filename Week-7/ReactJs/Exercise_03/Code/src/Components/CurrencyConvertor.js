import React, { useState } from 'react';

const CurrencyConvertor = () => {
  const [rupees, setRupees] = useState('');
  const [euro, setEuro] = useState(null);

  const handleSubmit = (e) => {
    e.preventDefault();
    const rate = 90; // Example: 1 Euro = ₹90
    const converted = rupees / rate;
    setEuro(converted.toFixed(2));
  };

  return (
    <div>
      <form onSubmit={handleSubmit}>
        <input
          type="number"
          value={rupees}
          onChange={(e) => setRupees(e.target.value)}
          placeholder="Enter amount in ₹"
        />
        <button type="submit">Convert</button>
      </form>
      {euro && <p>Converted: €{euro}</p>}
    </div>
  );
};

export default CurrencyConvertor;
