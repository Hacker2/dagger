package com.max.dgr;

import dagger.Component;
import javax.inject.Singleton;

@Singleton
@Component(modules = {UserCommandsModule.class, HelloWorldModule.class, LoginCommandModule.class, SystemOutModule.class})
interface CommandRouterFactory {
  CommandRouter router();
}
