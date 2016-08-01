package com.twu.biblioteca.router;

import com.twu.biblioteca.model.RouterState;
import com.twu.biblioteca.service.BibliotecaService;

/**
 * Created by chenzhou on 8/1/16.
 */
public class InitializeActionHandler implements IActionHandler {
    private RouterContext myContext;
    private BibliotecaService myService;

    public InitializeActionHandler(RouterContext myContext, BibliotecaService myService) {
        this.myContext = myContext;
        this.myService = myService;
    }

    @Override
    public RouterMessage Handle(String userInput) {
        myContext.setNestState(RouterState.MainMenu);
        return new RouterMessage(myService.GetWelcomeMessage(),false);
    }
}
