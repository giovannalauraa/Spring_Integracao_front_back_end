<template>
  <div class="page-holder bg-gray-100 mt-5">
    <b-container class="bv-example-row">
      <h1>Perfis</h1>

      <div :key="perfil.id" v-for="perfil in perfis">
        <ItemListaPerfis
          class="lista"
          :idPerfil="perfil.id"
          :perfil="perfil.nome"
          :img="perfil.foto"
        >
        </ItemListaPerfis>
      </div>
    </b-container>

    <button class="botao" type="button" v-on:click="testeConsulta">
      Clique em mim!
    </button>

    <div id="teste"></div>
  </div>
</template>

<script>
import ItemListaPerfis from "~/components/ItemListaPerfis.vue";
export default {
  name: "IndexPage",
  data() {
    return {
      perfis: [], // lista de perfis vazia
       /* {
          id: 2,
          nome: "Niki Lacrador",
          frase: "Só quem ama não pisa. Cuida, valoriza.",
          localizacao: "Brasil, Atibaia",
          imagem: "data:image/jpeg;base64,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",
          seguidores: 100 + "M",
          seguindo: 20,
        },
        {
          id: 3,
          nome: "Marcos Oeiras",
          frase: "Só quem ama não pisa. Cuida, valoriza.",
          localizacao: "Brasil, Atibaia",
          imagem: "https://placekitten.com/300/300",
          seguidores: 450,
          seguindo: 20,
        },
        {
          id: 4,
          nome: "Marcos Oeiras",
          frase: "Só quem ama não pisa. Cuida, valoriza.",
          localizacao: "Brasil, Atibaia",
          imagem: "https://placekitten.com/300/300",
          seguidores: 450,
          seguindo: 20,
        },
      ],*/
     teste: "",
    };
  },
  methods: {
   /* testeConsulta() {
      this.$axios.get("/perfil").then(function (response) {
        const div = document.querySelector("#teste");
        div.innerHTML = JSON.stringify(response.data);
      });*/
    },

    //Executando quando o Vue/Página é criado(a)
    async mounted(){
      const response = await this.$axios.get("/perfil");
      this.perfis = response.data;
  },
  components: { ItemListaPerfis }
};

</script>

<style>
.perfis {
  color: red;
}

.botao {
  background-color: rgb(156, 156, 160);
  margin-left: 400px;
  padding: 10px 10px 10px 10px;
  color: azure;
}
</style>
