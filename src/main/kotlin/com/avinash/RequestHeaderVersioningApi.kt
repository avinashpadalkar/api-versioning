package com.avinash

import io.micronaut.core.version.annotation.Version
import io.micronaut.http.HttpResponse
import io.micronaut.http.MutableHttpResponse
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get

@Version("1")
@Controller("/request_header_demo")
class RequestHeaderVersioningApi {

    @Get("/call")
    fun callV1(): MutableHttpResponse<*>? {
        return HttpResponse.ok("Calling V1")
    }

    @Version("2")
    @Get("/call")
    fun callV2(): MutableHttpResponse<*>? {
        return HttpResponse.ok("Calling V2")
    }

}
