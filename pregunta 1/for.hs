import Control.Monad.Cont



main :: IO ()
main = do
    putStrLn "Introduzca un valor"
    n <- getLine
    let a= 1
    let b= 0
    putStrLn "La serie de fibonacci es "
    forM_ [0..(read n)-1] $ \i -> do
        print b
        b = a ++ b
        
