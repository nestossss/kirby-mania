// Referências aos elementos
const addProductButton = document.getElementById("addProductButton");
const productNameInput = document.getElementById("productName");
const productPriceInput = document.getElementById("productPrice");
const productCategorySelect = document.getElementById("productCategory");
const productsContainer = document.getElementById("productsContainer");
const productForm = document.getElementById("add-product-form");

// Adicionar evento de clique no botão "Adicionar Produto"
addProductButton.addEventListener("click", () => {
    // Obter os valores dos inputs

    const productName = productNameInput.value.trim();
    const productPrice = productPriceInput.value.trim();
    const productCategory = productCategorySelect.value;

    // Validar os campos
    if (!productName || !productPrice || isNaN(productPrice) || parseFloat(productPrice) <= 0) {
        alert("Preencha todos os campos corretamente!");
        return;
    }

    // Criar um novo card de produto
    const productCard = document.createElement("div");
    productCard.className = "product-card";

    productCard.innerHTML = `
        <h4>${productName}</h4>
        <p>Preço: R$ ${parseFloat(productPrice).toFixed(2)}</p>
        <p>Categoria: ${productCategory}</p>
        <button class="delete-button">Excluir</button>
    `;

    // Adicionar evento de exclusão
    const deleteButton = productCard.querySelector(".delete-button");
    deleteButton.addEventListener("click", () => {
        productsContainer.removeChild(productCard);
    });

    // Adicionar o card à lista de produtos
    productsContainer.appendChild(productCard);

    // Envia formulario
    productForm.submit();

    // Limpar os campos do formulário
    productNameInput.value = "";
    productPriceInput.value = "";
    productCategorySelect.value = "camisas"; // Reset para o padrão
});
