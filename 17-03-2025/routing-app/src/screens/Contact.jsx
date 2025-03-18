
import React from 'react';

const Contact = () => {
  return (
    <div>
      <h2>Contact Us</h2>
      <div className="contact-info">
        <h3>Get in Touch</h3>
        <p>We're here to help you with any questions or concerns.</p>
        
        <div className="contact-details">
          <p><strong>Address:</strong> 123 Banking Street, Financial District</p>
          <p><strong>Phone:</strong> 1-800-BANK-HELP</p>
          <p><strong>Email:</strong> support@ournationalbank.com</p>
          
          <h3>Business Hours</h3>
          <p>Monday - Friday: 9:00 AM - 5:00 PM</p>
          <p>Saturday: 10:00 AM - 2:00 PM</p>
          <p>Sunday: Closed</p>
        </div>
      </div>
    </div>
  );
};

export default Contact;