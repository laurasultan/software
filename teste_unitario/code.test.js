const {somar, contaCaracter} = require("./code");

it("SOMAR DOIS NÚMEROS", ()=>{
    expect(somar(100, 200)).toBe(300);
});

it("CONTAR NÚMERO DE CARATERES", ()=>{
    expect(contaCaracter("Chaves")).toBe(6);
});