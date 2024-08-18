package xyz.pubps.artinus.adapter.in.web;

import static org.springframework.web.reactive.function.server.RouterFunctions.route;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.web.reactive.function.server.RouterFunction;
import xyz.pubps.artinus.application.handler.SubscriptionHandler;
import xyz.pubps.artinus.common.WebAdapter;

@RequiredArgsConstructor
@WebAdapter
public class SubscriptionRoute {

  private final SubscriptionHandler handler;

  @Bean
  RouterFunction<?> subscriptionRoutes() {
    return route()
        .POST("/subscription/subscribe", handler::subscribe)
        .POST("/subscription/unsubscribe", handler::unsubscribe)
        .GET("/subscription/list", handler::list)
        .build();
  }
}
