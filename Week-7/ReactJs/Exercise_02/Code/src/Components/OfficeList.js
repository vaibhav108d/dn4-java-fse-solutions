import React from 'react';

const OfficeList = () => {
  const offices = [
    {
      name: 'Tech Park View',
      rent: 75000,
      address: 'HSR Layout, Bangalore',
      image: 'https://img.freepik.com/free-photo/modern-office-space-interior_158595-5206.jpg'
    },
    {
      name: 'Startup Hub',
      rent: 55000,
      address: 'Indiranagar, Bangalore',
      image: 'https://t4.ftcdn.net/jpg/03/84/55/29/360_F_384552930_zPoe9zgmCF7qgt8fqSedcyJ6C6Ye3dFs.jpg'
    },
    {
      name: 'Business Central',
      rent: 65000,
      address: 'MG Road, Bangalore',
      image: 'https://via.placeholder.com/300?text=Business+Central'
    }
  ];

  return (
    <div >
      <h1 style={{ textAlign: 'center' }}>Office Space at Affordable Range</h1>

      {offices.map((office, idx) => (
        <div key={idx} style={{
          border: '1px solid #ccc',
          padding: '10px',
          margin: '10px',
          borderRadius: '8px'
        }}>
          <img src={office.image} alt={office.name} style={{ width: '300px' }} />
          <h2>{office.name}</h2>
          <p><strong>Address:</strong> {office.address}</p>
          <p style={{
            color: office.rent > 60000 ? 'green' : 'red',
            fontWeight: 'bold'
          }}>
            Rent: ₹{office.rent}
          </p>
        </div>
      ))}
    </div>
  );
};

export default OfficeList;
