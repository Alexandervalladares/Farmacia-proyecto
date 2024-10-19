package com.example.controller;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "home"; // Mapea a home.html
    }

    @GetMapping("/welcome")
    public String welcome(@AuthenticationPrincipal OAuth2User principal, Model model) {
        if (principal != null) {
            model.addAttribute("name", principal.getAttribute("name")); // Obtiene el nombre del usuario autenticado
        }
        return "welcome"; // Mapea a welcome.html
    }

    @GetMapping("/login")
    public String login() {
        return "login"; // Mapea a login.html
    }

    // Métodos para manejar las páginas de productos
    @GetMapping("/productos")
    public String productos() {
        return "productos"; // Mapea a productos.html
    }

    @GetMapping("/formProducto")
    public String formProducto() {
        return "formProducto"; // Mapea a formProducto.html
    }

    // Métodos para manejar las páginas de clientes
    @GetMapping("/clientes")
    public String clientes() {
        return "clientes"; // Mapea a clientes.html
    }

    @GetMapping("/formCliente")
    public String formCliente() {
        return "formCliente"; // Mapea a formCliente.html
    }


    @GetMapping("/ventas")
    public String ventas() {
        return "ventas"; // Mapea a ventas.html
    }

    @GetMapping("/formVenta")
    public String formVenta() {
        return "formVenta"; // Mapea a formVenta.html
    }


    @GetMapping("/usuarios")
    public String usuarios(Model model) {


        return "usuarios"; // Mapea a usuarios.html
    }

    @GetMapping("/formUsuario")
    public String formUsuario(Model model) {


        return "formUsuario"; // Mapea a formUsuario.html
    }
}
