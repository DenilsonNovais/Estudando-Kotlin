package com.mercadolivro.service

import com.mercadolivro.model.CustomerModel
import com.mercadolivro.repository.CustomerRepository
import org.springframework.stereotype.Service
import org.springframework.web.bind.annotation.PathVariable

@Service
class CustomerService(
    val customerRepository: CustomerRepository
) {

    fun getAll(name: String?): List<CustomerModel> {
        name?.let{
            return customerRepository.findByName(name)
        }
        return customerRepository.findAll().toList()
    }

    fun create(customer: CustomerModel) {
        customerRepository.save(customer)
    }

    fun getCustomers(@PathVariable id: Int): CustomerModel {
        return customerRepository.findById(id).orElseThrow()
    }

    fun update(customer: CustomerModel) {
        if (customerRepository.existsById(customer.id!!)) {
            customerRepository.save(customer)
        } else {
            throw Exception("Customer not found")
        }
    }

    fun delete(id: Int) {
        if (!customerRepository.existsById(id)) {
            throw Exception("Customer not found")
        }

        customerRepository.deleteById(id)
    }

}