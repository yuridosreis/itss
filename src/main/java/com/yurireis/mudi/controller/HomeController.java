package com.yurireis.mudi.controller;

import com.yurireis.mudi.model.PedidoModel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

@Controller
public class HomeController {

    @GetMapping("/home")
    public String Home(Model model){
        PedidoModel pedido = new PedidoModel();
        pedido.setNomeProduto("Samsung S22");
        pedido.setUrlImagem("https://samsungbr.vtexassets.com/arquivos/ids/331555-1200-auto?width=1200&height=auto&aspect=true");
        pedido.setUrlProduto("https://shop.samsung.com/br/galaxy-s22-5g/p?idsku=2567&utm_source=google&utm_medium=ppc&utm_" +
                "campaign=br_pd_ppc_google_galaxy-s22_ecommerce_cad3-a5316_pla_smartshopping_paid-cdm-$none$-SM-" +
                "S901EZKJZTO&utm_content=none&utm_term=SM-S901EZKJZTO&cid=br_pd_ppc_google_galaxy-s22_ecommerce_cad3-" +
                "a5316_pla_smartshopping_paid-cdm-$none$-SM-S901EZKJZTO&keeplink=true");
        pedido.setDescricao("Smartphone Samsung S22");

        List<PedidoModel> pedidos = Arrays.asList(pedido);
        model.addAttribute("pedidos", pedidos);

        return "home";
    }
}
