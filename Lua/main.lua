n = tonumber(io.read())

print("Hello HacktoberFest!")

function fatorial(n)
  local fat = 1

  for num = 2, n do
    fat = fat * num
  end

  return fat
end

io.write("fatorial(",n,") = ",fatorial(n))