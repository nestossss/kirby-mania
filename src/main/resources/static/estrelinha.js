function createStars() {
    const starsContainer = document.createElement('div');
    starsContainer.classList.add('stars');
    document.body.appendChild(starsContainer);
  
    // Criar muitas estrelinhas
    for (let i = 0; i < 300; i++) {  // Mantemos o número de estrelas alto
      const star = document.createElement('div');
      star.classList.add('star');
      
      // Tamanho aleatório entre 60px e 200px
      const size = Math.random() * (200 - 60) + 60; 
      star.style.width = `${size}px`;
      star.style.height = `${size}px`;
      
      // Girar aleatoriamente as estrelas
      const rotation = Math.random() * 360; // Rotação aleatória entre 0 a 360 graus
      star.style.transform = `rotate(${rotation}deg)`;
      
      // Posicionar as estrelinhas aleatoriamente fora da tela, acima da área visível
      star.style.left = `${Math.random() * 100}vw`;
      star.style.top = `-${Math.random() * 150 + 100}px`; // Ajuste para fazer as estrelas caírem de uma posição mais alta
      
      // Definir a animação para elas caírem rapidamente e acumular no meio
      star.style.animationDuration = `${Math.random() * 1 + 1.2}s`;  // Duração para queda rápida
      star.style.animationDelay = `${Math.random() * 0.5}s`;  // Atraso para variação no início
      
      // Garantir opacidade total (100%)
      star.style.opacity = '1';
  
      starsContainer.appendChild(star);
    }
  
    return starsContainer;
  }
  
  // Função para a navegação com animação
  function navigateToPage(url) {
    const stars = createStars();
    
    // Após a animação de 1.5s, redireciona para a página
    setTimeout(() => {
      window.location.href = url;
    }, 1500); // Tempo de animação das estrelinhas
  }
  
  // Lógica para o clique na div que envolve a imagem do Kirby
  document.querySelector('.log-img-K').addEventListener('click', () => {
    navigateToPage('caminhos.html');  // Substitua 'caminhos.html' pela URL de destino
  });
  