document.addEventListener('DOMContentLoaded', () => {
    const productGrid = document.querySelector('.product-grid');
    const addProductButton = document.getElementById('addProductButton');

    // Function to create and add a new product card
    function createProductCard(name, price) {
        const card = document.createElement('div');
        card.className = 'product-card';
        card.innerHTML = `
            <img src="/placeholder.svg?height=200&width=200" alt="${name}" class="product-image">
            <h3 class="product-title">${name}</h3>
            <p class="product-price">$${parseFloat(price).toFixed(2)}</p>
            <button class="buy-button">Add to Cart</button>
            <button class="delete-button">Delete</button>
        `;

        // Add event listeners for buttons in the new card
        const buyButton = card.querySelector('.buy-button');
        const deleteButton = card.querySelector('.delete-button');
        setupCartButton(buyButton);
        setupDeleteButton(deleteButton, card);

        productGrid.appendChild(card);
    }

    // Function to set up the "Add to Cart" button
    function setupCartButton(button) {
        button.addEventListener('click', () => {
            button.textContent = 'Added to Cart!';
            button.style.background = '#32CD32';

            setTimeout(() => {
                button.textContent = 'Add to Cart';
                button.style.background = '#ff69b4';
            }, 2000);
        });
    }

    // Function to set up the "Delete" button
    function setupDeleteButton(button, card) {
        button.addEventListener('click', () => {
            card.remove();
        });
    }

    // Handle adding a new product
    addProductButton.addEventListener('click', () => {
        const productName = document.getElementById('productName').value.trim();
        const productPrice = document.getElementById('productPrice').value.trim();

        // Validate input
        if (!productName || !productPrice || isNaN(productPrice) || productPrice <= 0) {
            alert('Please provide valid product details!');
            return;
        }

        // Create and add the new product card
        createProductCard(productName, productPrice);

        // Clear the input fields
        document.getElementById('productName').value = '';
        document.getElementById('productPrice').value = '';
    });

    // Initialize buttons for existing products
    const existingBuyButtons = document.querySelectorAll('.buy-button');
    const existingDeleteButtons = document.querySelectorAll('.delete-button');

    existingBuyButtons.forEach(button => setupCartButton(button));
    existingDeleteButtons.forEach(button => {
        const card = button.closest('.product-card');
        setupDeleteButton(button, card);
    });
});
