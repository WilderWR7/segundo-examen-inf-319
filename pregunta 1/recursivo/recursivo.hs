import Control.Monad.Cont

fib :: Integer -> Integer
fib 0 = 0
fib 1 = 1
fib n = fib (n-1) + fib (n-2)

main :: IO ()
main = do
    putStrLn "Introduzca un valor"
    n <- getLine
    putStrLn "La serie de fibonacci es "
    forM_ [0..(read n)-1] $ \i -> do
        let v = fib(i)
        print v