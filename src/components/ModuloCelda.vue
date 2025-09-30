<script setup lang="ts">

</script>

<template>
  <div>
    <h1 class="title">Bienvenido al Módulo de Celdas</h1>
  </div>
    <div class="d-grid gap-2 col-6 mx-auto botones" style="margin-top: 30px;">
        <button class="btn btn-primary w-100" type="button">Crear Tipo de Celda</button>
        <button class="btn btn-primary w-100" type="button">Modificar Tipo de Celda</button>
        <button class="btn btn-primary w-100" type="button">Crear Celda</button>
        <button class="btn btn-primary w-100" type="button">Consultar Celdas</button>
        <button class="btn btn-primary w-100" type="button">Modificar Celda</button>
    </div>
</template>

<style scoped>
    .title{
        display: flex;
        justify-content: center;
        font-style: italic;
        color: #1F2937;
    }
    .botones{
        min-height: calc(100vh - 390px);
    }
</style>
