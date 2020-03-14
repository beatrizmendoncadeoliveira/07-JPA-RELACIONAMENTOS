class ConsultaController{
    constructor(){
        let $=document.querySelector.bind(document);

        this._nome=$("#nome");
        this._data=$("#data");
        this._peso=$("#peso");
        this._altura=$("#altura");

       
        this._listaConsulta=new ListaConsulta();

        this._consultaView=new ConsultaView($("#consultaView"));
        this._consultaView.update(this._listaConsulta);

    }
    adiciona(evento){
        evento.preventDefault();
        this._listaConsulta.adiciona(this.criaConsulta());
        this._consultaView.update(this._listaConsulta);
        this.limpa();
    }
    criaConsulta(){
        return new Consulta(
            this._nome.value,
            new Date(this._data.value),
            this._peso.value,
            this._altura.value

        );
    }
    limpa(){
        this._nome.value="";
        this._data.value="";
        this._peso.value="";
        this._altura.value="";
    }
}