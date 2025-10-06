<script setup lang="ts">

</script>

<template>
  <div>
    <h1 class="title d-flex justify-content-center fst-italic">Registro de una nueva Celda</h1>
  </div>
    <select class="d-block mx-auto w-100 form-select mt-3 fst-italic" style="max-width: 500px;" aria-label="Default select example">
        <option selected>Tipo de Celda</option>
        <option value="1">Carro</option>
        <option value="2">Moto</option>
        <option value="3">Otro</option>
    </select>
    <select class="d-block mx-auto w-100 form-select mt-3 fst-italic" style="max-width: 500px;"aria-label="Default select example">
        <option selected>Zona Donde se Ubicará</option>
        <option value="1">Zona Carros</option>
        <option value="2">ZOna Motos</option>
        <option value="3">Otra</option>
    </select>  
    <div class="d-block mx-auto w-100 form-floating mt-2 fst-italic" style="max-width: 500px;">
        <input type="email" class="form-control" id="floatingInput" placeholder="name@example.com">
        <label clas="text fst-italic" for="floatingInput">Número de la Celda</label>
    </div>
    <div class="d-grip gap-2 col-6 mx-auto state mt-2 fst-italic">
        <h4>Estado:</h4>
        <input class="form-control" type="text" placeholder="Activo" aria-label="Disabled input example" disabled></input>
    </div>
    <div class="d-grip gap-2 col-6 mx-auto confirm mt-2">
        <button type="button" class="btn btn-outline-success">Registrar</button>
        <button type="button" class="btn btn-outline-danger">Cancelar</button>
    </div>
</template>

<style scoped>
    .state{
        display: flex;
        width: 500px;
        font-style: italic;
    }
    .confirm{
        display: flex;
        width: 500px;
        justify-content: center;
    }
</style>