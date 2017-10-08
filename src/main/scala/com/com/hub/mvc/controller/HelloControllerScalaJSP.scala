package com.com.hub.mvc.controller

import org.springframework.stereotype.Controller
import org.springframework.ui.ModelMap
import org.springframework.web.bind.annotation.RequestMapping

@RequestMapping(Array("/scala"))
@Controller
class HelloControllerScalaJSP {

  @RequestMapping(Array("/hello"))
  def printWelcome (model: ModelMap) : String = {
    model.addAttribute("message", "SCALA")
    "hello"
  }

}
