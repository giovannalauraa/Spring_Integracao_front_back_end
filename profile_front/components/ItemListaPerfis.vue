<template>
    <div class="item-perfis mb-2 pt-3 pb-3">
        <b-row>
            <b-col cols="2" class="d-flex align-items-center justify-content-center">
                <b-avatar v-bind:src=img></b-avatar>
            </b-col>
            <b-col cols="10" class="d-flex align-items-center justify-content-center">
                <NuxtLink :to="`/${idPerfil}}`">{{perfil}}</NuxtLink>
            </b-col>          
        </b-row>
    </div>
</template>

<script>
   export default {
    name: 'PerfilPage',
    props: ["idPerfil","perfil", "img"]
   }
</script>

<style>
    .item-perfis{
        background-color: rgba(90, 90, 90, 0.712);
        border-color: rgb(139, 0, 0);
        color: azure;
    }
</style>
