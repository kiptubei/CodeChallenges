#!/bin/ruby

def fib(n)
  case n
  when 0
    0
  when 1
    1
  else
    fib(n - 1) + fib(n - 2)
  end
end
puts 'Enter a positive integer between greater than 0'
t = gets.strip.to_i
sum = 0

(0..t - 1).each do |a0|
  sum += fib(a0) if fib(a0).even?
end

puts sum
