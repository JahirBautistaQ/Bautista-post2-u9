package com.universidad.productos_service.controller;

import com.universidad.productos_service.domain.Producto;
import com.universidad.productos_service.service.ProductoService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/productos")
public class ProductoController {

    private final ProductoService productoService;

    public ProductoController(ProductoService productoService) {
        this.productoService = productoService;
    }

    @GetMapping
    public List<Producto> listarTodos() {

        return productoService.listarTodos();
    }

    @GetMapping("/{id}")
    public Producto buscarPorId(@PathVariable Long id) {

        return productoService.buscarPorId(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Producto crear(@RequestBody Map<String, Object> body) {

        String nombre = body.get("nombre").toString();

        Double precio = Double.valueOf(body.get("precio").toString());

        Integer stock = Integer.valueOf(body.get("stock").toString());

        return productoService.crear(nombre, precio, stock);
    }

    @ExceptionHandler(RuntimeException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public String manejarRuntimeException(RuntimeException ex) {

        return ex.getMessage();
    }
}