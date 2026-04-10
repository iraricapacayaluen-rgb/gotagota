// EVENTOS EN JAVASCRIPT (CLICK, CARGAR, KEY,)
document.addEventListener("DOMContentLoaded", () => {
    fetch('http://localhost:8080/api/clientes')
        .then(response => response.json())
        .then(data => {

            //console.log('Datos:', data);
            const elemento = document.getElementById("table-cliente")
            for (let i = 0; i < data.length; i++) {
                // data[i], muestra en forma de array
                const cliente = data[i]
                const row = document.createElement("tr")
                // alt + 96 
                row.innerHTML = `
                          <tr>
                          <td>${cliente.id}</td>
                          <td>${cliente.nombre}</td>    
                          <td>${cliente.apellido}</td>
                          <td>${cliente.dni}</td>
                          <td>${cliente.telefono}</td>
                          <td>${cliente.direccion}</td>
                          <td>
                               <div class="d-flex gap-2">

                                  <!-- Botón Editar -->

                               <button class="btn btn-outline-primary">
                               Editar
                                </button>

                                       
                                <!-- Botón Eliminar -->

                             <button class="btn btn-outline-danger">
                                      Eliminar
                                      </button>

                      </div>

                      </buton>
                          </td>
                          </tr>

                          `
                elemento.appendChild(row)

                console.log(cliente) // Muestra los resultados en consola 
            }
        })








});
