<script setup lang="ts">

</script>

<template>
  <div>
    <h1 class="title">Registro de una nueva Celda</h1>
  </div>
    <select class="d-grid gap-2 col-6 mx-auto form-select" aria-label="Default select example" style="margin-top: 30px;">
        <option selected>Tipo de Celda</option>
        <option value="1">Carro</option>
        <option value="2">Moto</option>
        <option value="3">Otro</option>
    </select>
    <select class="d-grid gap-2 col-6 mx-auto form-select" aria-label="Default select example" style="margin-top: 10px;">
        <option selected>Zona Donde se Ubicará</option>
        <option value="1">Zona Carros</option>
        <option value="2">ZOna Motos</option>
        <option value="3">Otra</option>
    </select>  
    <div class="d-grid gap-2 col-6 mx-auto form-floating mb-3" style="margin-top: 10px;">
        <input type="email" class="form-control" id="floatingInput" placeholder="name@example.com">
        <label clas="text" for="floatingInput">Email address</label>
    </div>
</template>

<style scoped>
    .title{
        display: flex;
        justify-content: center;
        font-style: italic;
        color: #1F2937;
    }

    .form-select{
        display: flex;
        justify-content: center;
        width: 300px;
    }

    .form-floating{
        display: flex;
        justify-content: center;
        width: 300px;        
    }
</style>