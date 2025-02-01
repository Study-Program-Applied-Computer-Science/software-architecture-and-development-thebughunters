<template>
    <div class="flex">
  
      <AppSidebar class="fixed left-0 top-0 h-full" />
  
      <div class="main-content">
        <h1 class="page-title">Coupons Page</h1>
  
        <div class="cards-container">
          <div class="coupon-card">
            <div class="coupon-header blue-header">
              <h2>20% OFF</h2>
              <i class="fas fa-gift"></i>
            </div>
            <div class="coupon-body">
              <p>Save 20% on your next purchase. Limited time offer!</p>
              <div class="coupon-footer">
                <p><strong>Code:</strong> FIONA20</p>
                <p><strong>Expires:</strong> 11-03-2025</p>
              </div>
            </div>
          </div>
  
          <div class="coupon-card">
            <div class="coupon-header green-header">
              <h2>10% OFF</h2>
              <i class="fas fa-gift"></i>
            </div>
            <div class="coupon-body">
              <p>Get 10% off on your first purchase. Don't miss out!</p>
              <div class="coupon-footer">
                <p><strong>Code:</strong> GINGER10</p>
                <p><strong>Expires:</strong> 05-25-2025</p>
              </div>
            </div>
          </div>
  
          <div class="coupon-card">
            <div class="coupon-header purple-header">
              <h2>50% OFF</h2>
              <i class="fas fa-tag"></i>
            </div>
            <div class="coupon-body">
              <p>Enjoy 50% off your favorite items. Don't miss this deal!</p>
              <div class="coupon-footer">
                <p><strong>Code:</strong> SAVE50</p>
                <p><strong>Expires:</strong> 12-15-2025</p>
              </div>
            </div>
          </div>
  
          <div class="coupon-card">
            <div class="coupon-header orange-header">
              <h2>15% OFF</h2>
              <i class="fas fa-star"></i>
            </div>
            <div class="coupon-body">
              <p>Get 15% off on orders above $50. Act now!</p>
              <div class="coupon-footer">
                <p><strong>Code:</strong> STAR15</p>
                <p><strong>Expires:</strong> 07-10-2025</p>
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>
  </template>
  
  <script>

  
  export default {
    name: "CouponsPage",
    components: {
      
    },
  };
  </script>
  
  <style scoped>
  
  
  .main-content {
     flex: 1; 
     display: flex; 
     flex-direction: column; 
    padding: 1.5rem; 
    margin-left: 5rem; 
    background-color: #f3f4f6; 
    height: 100vh;
  }
  
  
  .page-title {
    color: #34d399; 
    font-size: 1.875rem; 
    font-weight: bold;
    margin-bottom: 1rem; 
    margin-top: 0;
  }
  
  
  .cards-container {
    display: grid;
    grid-template-columns: repeat(3, 1fr); 
    grid-template-rows: auto; 
    gap: 1.5rem; 
  }
  
  .coupon-card:nth-child(4) {
    grid-column: 1 / span 1;
    grid-row: 2;
  }
  
  .coupon-card {
    background-color: #ffffff; 
    border: 1px solid #d1d5db; 
    border-radius: 0.5rem;
    box-shadow: 0 2px 4px rgba(0, 0, 0, 0.1); 
    display: flex;
    flex-direction: column;
  }
  
  .coupon-header {
    display: flex;
    justify-content: space-between;
    align-items: center;
    padding: 1rem;
    border-top-left-radius: 0.5rem;
    border-top-right-radius: 0.5rem;
    color: #ffffff;
    font-size: 1.25rem; 
    font-weight: bold;
  }
  
  .blue-header {
    background-color: #3b82f6;
  }
  
  .green-header {
    background-color: #10b981; 
  }
  
  .purple-header {
    background-color: #a855f7; 
  }
  
  .orange-header {
    background-color: #f97316; 
  }
  
  .coupon-body {
    padding: 1rem;
    flex: 1;
  }
  
  .coupon-body p {
    color: #4b5563; 
    font-size: 0.875rem; 
    margin-bottom: 1rem;
  }
  
  .coupon-footer {
    border-top: 1px solid #e5e7eb; 
    padding-top: 0.5rem;
  }
  
  .coupon-footer p {
    color: #6b7280; 
    font-size: 0.875rem; 
  }
  </style>