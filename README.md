# Liskov Substitution Principle (LSP)

### Esse projeto viola o LSP.

#### Problemas

- Ao usarmos `Rectangle` e `Square` de forma intercambiável, a área do quadrado é calculada incorretamente;
- Isso viola o LSP, pois a substituição de um `Rectangle` por um `Square` altera o comportamento esperado.
