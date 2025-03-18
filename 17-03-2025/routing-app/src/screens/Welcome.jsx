import React from 'react';
const Welcome = () => {
    return (
        <div className="welcome-screen">
            <h2>Welcome to Your Account</h2>
            <p>Thank you for logging in to Our National Bank's online banking service.</p>
            <div className="account-summary">
                <h3>Quick Account Summary</h3>
                <p>Current Account: $X,XXX.XX</p>
                <p>Savings Account: $XX,XXX.XX</p>
            </div>
            <div className="quick-actions">
                <h3>Quick Actions</h3>
                <button>View Transactions</button>
                <button>Transfer Funds</button>
                <button>Pay Bills</button>
            </div>
        </div>
    );
};

export default Welcome;










