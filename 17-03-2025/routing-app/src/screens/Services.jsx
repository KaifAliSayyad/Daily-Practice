const Services = () => {
  return (
    <div>
      <h2>Our Services</h2>
      <div className="services-list">
        <div className="service-item">
          <h3>Personal Banking</h3>
          <ul>
            <li>Savings Accounts</li>
            <li>Checking Accounts</li>
            <li>Personal Loans</li>
            <li>Credit Cards</li>
          </ul>
        </div>
        
        <div className="service-item">
          <h3>Business Banking</h3>
          <ul>
            <li>Business Accounts</li>
            <li>Merchant Services</li>
            <li>Business Loans</li>
            <li>Trade Finance</li>
          </ul>
        </div>
      </div>
    </div>
  );
};

export default Services;